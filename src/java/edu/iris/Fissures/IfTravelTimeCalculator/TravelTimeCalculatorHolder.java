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

package edu.iris.Fissures.IfTravelTimeCalculator;

//
// IDL:iris.edu/Fissures/IfTravelTimeCalculator/TravelTimeCalculator:1.0
//
final public class TravelTimeCalculatorHolder implements org.omg.CORBA.portable.Streamable
{
    public TravelTimeCalculator value;

    public
    TravelTimeCalculatorHolder()
    {
    }

    public
    TravelTimeCalculatorHolder(TravelTimeCalculator initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = TravelTimeCalculatorHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        TravelTimeCalculatorHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return TravelTimeCalculatorHelper.type();
    }
}
