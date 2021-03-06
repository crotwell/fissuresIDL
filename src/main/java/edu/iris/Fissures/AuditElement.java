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
// IDL:iris.edu/Fissures/AuditElement:1.0
//
/** The audit item holds the time of the event in addition to the
 *audit info */

final public class AuditElement implements org.omg.CORBA.portable.IDLEntity
{
    public
    AuditElement()
    {
    }

    public
    AuditElement(Time time_occurred,
                 AuditInfo information)
    {
        this.time_occurred = time_occurred;
        this.information = information;
    }

    public Time time_occurred;
    public AuditInfo information;
}
