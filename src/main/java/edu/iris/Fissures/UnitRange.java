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
// IDL:iris.edu/Fissures/UnitRange:1.0
//
/** A range of values associated with units. */

public abstract class UnitRange implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/UnitRange/the_units:1.0
    //
    /***/

    public Unit the_units;

    //
    // IDL:iris.edu/Fissures/UnitRange/min_value:1.0
    //
    /***/

    public double min_value;

    //
    // IDL:iris.edu/Fissures/UnitRange/max_value:1.0
    //
    /***/

    public double max_value;

    private static String[] _OB_truncatableIds_ =
    {
        UnitRangeHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        the_units = UnitHelper.read(in);
        min_value = in.read_double();
        max_value = in.read_double();
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        UnitHelper.write(out, the_units);
        out.write_double(min_value);
        out.write_double(max_value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return UnitRangeHelper.type();
    }
}
