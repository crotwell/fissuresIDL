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
// IDL:iris.edu/Fissures/IfNetwork/DuplicateChannelId:1.0
//
final public class DuplicateChannelIdHolder implements org.omg.CORBA.portable.Streamable
{
    public DuplicateChannelId value;

    public
    DuplicateChannelIdHolder()
    {
    }

    public
    DuplicateChannelIdHolder(DuplicateChannelId initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = DuplicateChannelIdHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        DuplicateChannelIdHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return DuplicateChannelIdHelper.type();
    }
}
