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
// IDL:iris.edu/Fissures/IfNetwork/ChannelId:1.0
//
final public class ChannelIdHolder implements org.omg.CORBA.portable.Streamable
{
    public ChannelId value;

    public
    ChannelIdHolder()
    {
    }

    public
    ChannelIdHolder(ChannelId initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ChannelIdHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ChannelIdHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ChannelIdHelper.type();
    }
}
