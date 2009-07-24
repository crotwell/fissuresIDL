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

package edu.iris.Fissures;

//
// IDL:iris.edu/Fissures/DimensionSeq:1.0
//
final public class DimensionSeqHelper
{
    public static void
    insert(org.omg.CORBA.Any any, Dimension[] val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static Dimension[]
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
            typeCode_ = orb.create_alias_tc(id(), "DimensionSeq", orb.create_sequence_tc(0, DimensionHelper.type()));
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/DimensionSeq:1.0";
    }

    public static Dimension[]
    read(org.omg.CORBA.portable.InputStream in)
    {
        Dimension[] _ob_v;
        int len0 = in.read_ulong();
        _ob_v = new Dimension[len0];
        for(int i0 = 0 ; i0 < len0 ; i0++)
            _ob_v[i0] = DimensionHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, Dimension[] val)
    {
        int len0 = val.length;
        out.write_ulong(len0);
        for(int i0 = 0 ; i0 < len0 ; i0++)
            DimensionHelper.write(out, val[i0]);
    }
}