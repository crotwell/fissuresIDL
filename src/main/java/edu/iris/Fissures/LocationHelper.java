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
// IDL:iris.edu/Fissures/Location:1.0
//
final public class LocationHelper
{
    public static void
    insert(org.omg.CORBA.Any any, Location val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static Location
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[5];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "latitude";
            members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "longitude";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "elevation";
            members[2].type = LengthHelper.type();

            members[3] = new org.omg.CORBA.StructMember();
            members[3].name = "depth";
            members[3].type = LengthHelper.type();

            members[4] = new org.omg.CORBA.StructMember();
            members[4].name = "type";
            members[4].type = LocationTypeHelper.type();

            typeCode_ = orb.create_struct_tc(id(), "Location", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/Location:1.0";
    }

    public static Location
    read(org.omg.CORBA.portable.InputStream in)
    {
        Location _ob_v = new Location();
        _ob_v.latitude = in.read_float();
        _ob_v.longitude = in.read_float();
        _ob_v.elevation = LengthHelper.read(in);
        _ob_v.depth = LengthHelper.read(in);
        _ob_v.type = LocationTypeHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, Location val)
    {
        out.write_float(val.latitude);
        out.write_float(val.longitude);
        LengthHelper.write(out, val.elevation);
        LengthHelper.write(out, val.depth);
        LocationTypeHelper.write(out, val.type);
    }
}