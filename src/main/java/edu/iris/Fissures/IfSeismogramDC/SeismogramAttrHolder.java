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

package edu.iris.Fissures.IfSeismogramDC;

//
// IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr:1.0
//
final public class SeismogramAttrHolder implements org.omg.CORBA.portable.Streamable
{
    public SeismogramAttr value;

    public
    SeismogramAttrHolder()
    {
    }

    public
    SeismogramAttrHolder(SeismogramAttr initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = SeismogramAttrHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        SeismogramAttrHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return SeismogramAttrHelper.type();
    }
}
