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

package edu.iris.Fissures.IfTimeSeries;

//
// IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin:1.0
//
final public class TimeSeriesAdminHolder implements org.omg.CORBA.portable.Streamable
{
    public TimeSeriesAdmin value;

    public
    TimeSeriesAdminHolder()
    {
    }

    public
    TimeSeriesAdminHolder(TimeSeriesAdmin initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = TimeSeriesAdminHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        TimeSeriesAdminHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return TimeSeriesAdminHelper.type();
    }
}
