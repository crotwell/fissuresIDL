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
// IDL:iris.edu/Fissures/Dimension:1.0
//
/** The dimension in pixels of a display area. */

final public class Dimension implements org.omg.CORBA.portable.IDLEntity
{
    public
    Dimension()
    {
    }

    public
    Dimension(int width,
              int height)
    {
        this.width = width;
        this.height = height;
    }

    public int width;
    public int height;
}
