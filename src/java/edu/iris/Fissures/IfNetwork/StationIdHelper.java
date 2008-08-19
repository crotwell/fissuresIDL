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

package edu.iris.Fissures.IfNetwork;

//
// IDL:iris.edu/Fissures/IfNetwork/StationId:1.0
//
final public class StationIdHelper
{
    public static void
    insert(org.omg.CORBA.Any any, StationId val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static StationId
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
            members[0].name = "network_id";
            members[0].type = NetworkIdHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "station_code";
            members[1].type = StationCodeHelper.type();

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "begin_time";
            members[2].type = edu.iris.Fissures.TimeHelper.type();

            typeCode_ = orb.create_struct_tc(id(), "StationId", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfNetwork/StationId:1.0";
    }

    public static StationId
    read(org.omg.CORBA.portable.InputStream in)
    {
        StationId _ob_v = new StationId();
        _ob_v.network_id = NetworkIdHelper.read(in);
        _ob_v.station_code = StationCodeHelper.read(in);
        _ob_v.begin_time = edu.iris.Fissures.TimeHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, StationId val)
    {
        NetworkIdHelper.write(out, val.network_id);
        StationCodeHelper.write(out, val.station_code);
        edu.iris.Fissures.TimeHelper.write(out, val.begin_time);
    }
}
