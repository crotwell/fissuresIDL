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
// IDL:iris.edu/Fissures/IfNetwork/ChannelNotFound:1.0
//
final public class ChannelNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
    public ChannelNotFound value;

    public
    ChannelNotFoundHolder()
    {
    }

    public
    ChannelNotFoundHolder(ChannelNotFound initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ChannelNotFoundHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ChannelNotFoundHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ChannelNotFoundHelper.type();
    }
}
