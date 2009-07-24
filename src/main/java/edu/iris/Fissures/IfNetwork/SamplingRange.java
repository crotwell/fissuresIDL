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
// IDL:iris.edu/Fissures/IfNetwork/SamplingRange:1.0
//
/***/

public abstract class SamplingRange implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/IfNetwork/SamplingRange/min:1.0
    //
    /***/

    public edu.iris.Fissures.Sampling min;

    //
    // IDL:iris.edu/Fissures/IfNetwork/SamplingRange/max:1.0
    //
    /***/

    public edu.iris.Fissures.Sampling max;

    private static String[] _OB_truncatableIds_ =
    {
        SamplingRangeHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        min = edu.iris.Fissures.SamplingHelper.read(in);
        max = edu.iris.Fissures.SamplingHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        edu.iris.Fissures.SamplingHelper.write(out, min);
        edu.iris.Fissures.SamplingHelper.write(out, max);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return SamplingRangeHelper.type();
    }
}