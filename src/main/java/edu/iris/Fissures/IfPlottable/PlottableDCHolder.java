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

package edu.iris.Fissures.IfPlottable;

//
// IDL:iris.edu/Fissures/IfPlottable/PlottableDC:1.0
//
final public class PlottableDCHolder implements org.omg.CORBA.portable.Streamable
{
    public PlottableDC value;

    public
    PlottableDCHolder()
    {
    }

    public
    PlottableDCHolder(PlottableDC initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = PlottableDCHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        PlottableDCHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return PlottableDCHelper.type();
    }
}
