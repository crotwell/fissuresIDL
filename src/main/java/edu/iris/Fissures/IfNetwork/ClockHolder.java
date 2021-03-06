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
// IDL:iris.edu/Fissures/IfNetwork/Clock:1.0
//
final public class ClockHolder implements org.omg.CORBA.portable.Streamable
{
    public Clock value;

    public
    ClockHolder()
    {
    }

    public
    ClockHolder(Clock initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ClockHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ClockHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ClockHelper.type();
    }
}
