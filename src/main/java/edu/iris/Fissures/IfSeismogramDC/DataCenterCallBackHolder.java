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
// IDL:iris.edu/Fissures/IfSeismogramDC/DataCenterCallBack:1.0
//
final public class DataCenterCallBackHolder implements org.omg.CORBA.portable.Streamable
{
    public DataCenterCallBack value;

    public
    DataCenterCallBackHolder()
    {
    }

    public
    DataCenterCallBackHolder(DataCenterCallBack initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = DataCenterCallBackHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        DataCenterCallBackHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return DataCenterCallBackHelper.type();
    }
}