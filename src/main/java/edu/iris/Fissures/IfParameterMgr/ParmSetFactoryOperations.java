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
// IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFactory:1.0
//
/**
 * The ParmSetFactory provides the operations to to define a ParmSet
 **/

public interface ParmSetFactoryOperations extends ParmSetFinderOperations
{
    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFactory/create:1.0
    //
    /***/

    void
    create(ParmSetAttr attr);

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFactory/destroy:1.0
    //
    /***/

    void
    destroy();

    //
    // IDL:iris.edu/Fissures/IfParameterMgr/ParmSetFactory/create_parameter_def:1.0
    //
    /***/

    void
    create_parameter_def(ParmDef parm_definition)
        throws edu.iris.Fissures.FissuresException;
}
