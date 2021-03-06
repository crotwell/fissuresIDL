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
// IDL:iris.edu/Fissures/IfEvent/EventNotFound:1.0
//
/***/

final public class EventNotFound extends org.omg.CORBA.UserException
{
    public
    EventNotFound()
    {
        super(EventNotFoundHelper.id());
    }

    public
    EventNotFound(String event)
    {
        super(EventNotFoundHelper.id());
        this.event = event;
    }

    public
    EventNotFound(String _reason,
                  String event)
    {
        super(EventNotFoundHelper.id() + " " + _reason);
        this.event = event;
    }

    public String event;
}
