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

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAttr:1.0
//
final public class DataSetAttrHolder implements org.omg.CORBA.portable.Streamable
{
    public DataSetAttr value;

    public
    DataSetAttrHolder()
    {
    }

    public
    DataSetAttrHolder(DataSetAttr initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = DataSetAttrHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        DataSetAttrHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return DataSetAttrHelper.type();
    }
}
