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

package edu.iris.Fissures.IfService;

//
// IDL:iris.edu/Fissures/IfService/UnknownOption:1.0
//
final public class UnknownOptionHolder implements org.omg.CORBA.portable.Streamable
{
    public UnknownOption value;

    public
    UnknownOptionHolder()
    {
    }

    public
    UnknownOptionHolder(UnknownOption initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = UnknownOptionHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        UnknownOptionHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return UnknownOptionHelper.type();
    }
}