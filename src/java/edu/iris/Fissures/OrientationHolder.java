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

package edu.iris.Fissures;

//
// IDL:iris.edu/Fissures/Orientation:1.0
//
final public class OrientationHolder implements org.omg.CORBA.portable.Streamable
{
    public Orientation value;

    public
    OrientationHolder()
    {
    }

    public
    OrientationHolder(Orientation initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = OrientationHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        OrientationHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return OrientationHelper.type();
    }
}
