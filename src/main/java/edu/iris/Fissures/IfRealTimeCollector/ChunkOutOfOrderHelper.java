// **********************************************************************
//
// Generated by the ORBacus IDL to Java Translator
//
// Copyright (c) 2000
// Object Oriented Concepts, Inc.
// Billerica, MA, USA
//
// All Rights Reserved
//
// **********************************************************************

// Version: 4.0.5

package edu.iris.Fissures.IfRealTimeCollector;

//
// IDL:iris.edu/Fissures/IfRealTimeCollector/ChunkOutOfOrder:1.0
//
final public class ChunkOutOfOrderHelper
{
    public static void
    insert(org.omg.CORBA.Any any, ChunkOutOfOrder val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static ChunkOutOfOrder
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
            return read(any.create_input_stream());
        else
            throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[2];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "last_valid_seq_num";
            members[0].type = LongSeqHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "channels";
            members[1].type = ChannelIdSeqHelper.type();

            typeCode_ = orb.create_exception_tc(id(), "ChunkOutOfOrder", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfRealTimeCollector/ChunkOutOfOrder:1.0";
    }

    public static ChunkOutOfOrder
    read(org.omg.CORBA.portable.InputStream in)
    {
        if(!id().equals(in.read_string()))
            throw new org.omg.CORBA.MARSHAL();

        ChunkOutOfOrder _ob_v = new ChunkOutOfOrder();
        _ob_v.last_valid_seq_num = LongSeqHelper.read(in);
        _ob_v.channels = ChannelIdSeqHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, ChunkOutOfOrder val)
    {
        out.write_string(id());
        LongSeqHelper.write(out, val.last_valid_seq_num);
        ChannelIdSeqHelper.write(out, val.channels);
    }
}