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
// IDL:iris.edu/Fissures/IfDataSetMgr/RemoteDataSetAccess:1.0
//
final public class RemoteDataSetAccessHolder implements org.omg.CORBA.portable.Streamable
{
    public RemoteDataSetAccess value;

    public
    RemoteDataSetAccessHolder()
    {
    }

    public
    RemoteDataSetAccessHolder(RemoteDataSetAccess initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = RemoteDataSetAccessHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        RemoteDataSetAccessHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return RemoteDataSetAccessHelper.type();
    }
}
