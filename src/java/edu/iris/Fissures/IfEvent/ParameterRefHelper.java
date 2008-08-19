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
// IDL:iris.edu/Fissures/IfEvent/ParameterRef:1.0
//
final public class ParameterRefHelper
{
    public static void
    insert(org.omg.CORBA.Any any, edu.iris.Fissures.IfParameterMgr.ParameterRef val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static edu.iris.Fissures.IfParameterMgr.ParameterRef
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
            typeCode_ = orb.create_alias_tc(id(), "ParameterRef", edu.iris.Fissures.IfParameterMgr.ParameterRefHelper.type());
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfEvent/ParameterRef:1.0";
    }

    public static edu.iris.Fissures.IfParameterMgr.ParameterRef
    read(org.omg.CORBA.portable.InputStream in)
    {
        edu.iris.Fissures.IfParameterMgr.ParameterRef _ob_v;
        _ob_v = edu.iris.Fissures.IfParameterMgr.ParameterRefHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, edu.iris.Fissures.IfParameterMgr.ParameterRef val)
    {
        edu.iris.Fissures.IfParameterMgr.ParameterRefHelper.write(out, val);
    }
}
