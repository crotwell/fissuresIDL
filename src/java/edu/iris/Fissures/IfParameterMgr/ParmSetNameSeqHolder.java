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

package edu.iris.Fissures.IfParameterMgr;

//
// IDL:iris.edu/Fissures/IfParameterMgr/ParmSetNameSeq:1.0
//
final public class ParmSetNameSeqHolder implements org.omg.CORBA.portable.Streamable
{
    public String[] value;

    public
    ParmSetNameSeqHolder()
    {
    }

    public
    ParmSetNameSeqHolder(String[] initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ParmSetNameSeqHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ParmSetNameSeqHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ParmSetNameSeqHelper.type();
    }
}
