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
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetFactory:1.0
//
/***/

public interface DataSetFactoryOperations extends DataSetComponentOperations
{
    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetFactory/create:1.0
    //
    /***/

    DataSetAccess
    create(DataSetAttr attr,
           edu.iris.Fissures.AuditInfo[] audit_info);

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetFactory/copy:1.0
    //
    /***/

    DataSetAccess
    copy(DataSet a_dataset,
         edu.iris.Fissures.AuditInfo[] audit_info);

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetFactory/destroy_node:1.0
    //
    /***/

    void
    destroy_node(String a_node,
                 edu.iris.Fissures.AuditInfo[] audit_info)
        throws NotFound;
}