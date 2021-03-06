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
// IDL:iris.edu/Fissures/IfNetwork/ListFilter:1.0
//
/** Represents a list style response. Similar to blockette 55 in SEED.
 *NOTE that this style response should only be used for older data where
 *coefficients or poles and zeros are not availible. */

final public class ListFilter implements org.omg.CORBA.portable.IDLEntity
{
    public
    ListFilter()
    {
    }

    public
    ListFilter(float[] frequency,
               edu.iris.Fissures.Unit frequency_unit,
               float[] amplitude,
               float[] amplitude_error,
               float[] phase,
               edu.iris.Fissures.Unit phase_unit,
               float[] phase_error)
    {
        this.frequency = frequency;
        this.frequency_unit = frequency_unit;
        this.amplitude = amplitude;
        this.amplitude_error = amplitude_error;
        this.phase = phase;
        this.phase_unit = phase_unit;
        this.phase_error = phase_error;
    }

    public float[] frequency;
    public edu.iris.Fissures.Unit frequency_unit;
    public float[] amplitude;
    public float[] amplitude_error;
    public float[] phase;
    public edu.iris.Fissures.Unit phase_unit;
    public float[] phase_error;
}
