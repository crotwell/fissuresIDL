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
// IDL:iris.edu/Fissures/IfEvent/EventAccess:1.0
//
final public class EventAccessHolder implements org.omg.CORBA.portable.Streamable
{
    public EventAccess value;

    public
    EventAccessHolder()
    {
    }

    public
    EventAccessHolder(EventAccess initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = EventAccessHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        EventAccessHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return EventAccessHelper.type();
    }
}