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

package edu.iris.Fissures.IfPickMgr;

//
// IDL:iris.edu/Fissures/IfPickMgr/PickDC:1.0
//
final public class PickDCHolder implements org.omg.CORBA.portable.Streamable
{
    public PickDC value;

    public
    PickDCHolder()
    {
    }

    public
    PickDCHolder(PickDC initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = PickDCHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        PickDCHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return PickDCHelper.type();
    }
}
