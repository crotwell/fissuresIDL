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
// IDL:iris.edu/Fissures/LocationType:1.0
//
final public class LocationTypeHelper
{
    public static void
    insert(org.omg.CORBA.Any any, LocationType val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static LocationType
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
            String[] members = new String[2];
            members[0] = "GEOGRAPHIC";
            members[1] = "GEOCENTRIC";
            typeCode_ = orb.create_enum_tc(id(), "LocationType", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/LocationType:1.0";
    }

    public static LocationType
    read(org.omg.CORBA.portable.InputStream in)
    {
        LocationType _ob_v;
        _ob_v = LocationType.from_int(in.read_ulong());
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, LocationType val)
    {
        out.write_ulong(val.value());
    }
}