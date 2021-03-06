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

package edu.iris.Fissures.IfSeismogramDC;

//
// IDL:iris.edu/Fissures/IfSeismogramDC/GroupRequest:1.0
//
final public class GroupRequestHelper
{
    public static void
    insert(org.omg.CORBA.Any any, GroupRequest val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static GroupRequest
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[3];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "channels";
            members[0].type = ChannelGroupHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "start_time";
            members[1].type = edu.iris.Fissures.TimeHelper.type();

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "end_time";
            members[2].type = edu.iris.Fissures.TimeHelper.type();

            typeCode_ = orb.create_struct_tc(id(), "GroupRequest", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfSeismogramDC/GroupRequest:1.0";
    }

    public static GroupRequest
    read(org.omg.CORBA.portable.InputStream in)
    {
        GroupRequest _ob_v = new GroupRequest();
        _ob_v.channels = ChannelGroupHelper.read(in);
        _ob_v.start_time = edu.iris.Fissures.TimeHelper.read(in);
        _ob_v.end_time = edu.iris.Fissures.TimeHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, GroupRequest val)
    {
        ChannelGroupHelper.write(out, val.channels);
        edu.iris.Fissures.TimeHelper.write(out, val.start_time);
        edu.iris.Fissures.TimeHelper.write(out, val.end_time);
    }
}
