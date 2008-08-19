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
// IDL:iris.edu/Fissures/IfEvent/NoPreferredOrigin:1.0
//
final public class NoPreferredOriginHelper
{
    public static void
    insert(org.omg.CORBA.Any any, NoPreferredOrigin val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static NoPreferredOrigin
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[0];

            typeCode_ = orb.create_exception_tc(id(), "NoPreferredOrigin", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfEvent/NoPreferredOrigin:1.0";
    }

    public static NoPreferredOrigin
    read(org.omg.CORBA.portable.InputStream in)
    {
        if(!id().equals(in.read_string()))
            throw new org.omg.CORBA.MARSHAL();

        NoPreferredOrigin _ob_v = new NoPreferredOrigin();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, NoPreferredOrigin val)
    {
        out.write_string(id());
    }
}
