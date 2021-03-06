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

package edu.iris.Fissures.IfEvent;

//
// IDL:iris.edu/Fissures/IfEvent/Magnitude:1.0
//
final public class MagnitudeHelper
{
    public static void
    insert(org.omg.CORBA.Any any, Magnitude val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static Magnitude
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
            members[0].name = "type";
            members[0].type = MagTypeHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "value";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "contributor";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            typeCode_ = orb.create_struct_tc(id(), "Magnitude", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfEvent/Magnitude:1.0";
    }

    public static Magnitude
    read(org.omg.CORBA.portable.InputStream in)
    {
        Magnitude _ob_v = new Magnitude();
        _ob_v.type = MagTypeHelper.read(in);
        _ob_v.value = in.read_float();
        _ob_v.contributor = in.read_string();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, Magnitude val)
    {
        MagTypeHelper.write(out, val.type);
        out.write_float(val.value);
        out.write_string(val.contributor);
    }
}
