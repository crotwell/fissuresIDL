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
public class DataSetFactoryPOATie extends DataSetFactoryPOA
{
    private DataSetFactoryOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    DataSetFactoryPOATie(DataSetFactoryOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    DataSetFactoryPOATie(DataSetFactoryOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public DataSetFactoryOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(DataSetFactoryOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public org.omg.PortableServer.POA
    _default_POA()
    {
        if(_ob_poa_ != null)
            return _ob_poa_;
        else
            return super._default_POA();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_finder:1.0
    //
    public DataSetFinder
    a_finder()
    {
        return _ob_delegate_.a_finder();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_factory:1.0
    //
    public DataSetFactory
    a_factory()
    {
        return _ob_delegate_.a_factory();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetFactory/create:1.0
    //
    public DataSetAccess
    create(DataSetAttr attr,
           edu.iris.Fissures.AuditInfo[] audit_info)
    {
        return _ob_delegate_.create(attr,
                                    audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetFactory/copy:1.0
    //
    public DataSetAccess
    copy(DataSet a_dataset,
         edu.iris.Fissures.AuditInfo[] audit_info)
    {
        return _ob_delegate_.copy(a_dataset,
                                  audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetFactory/destroy_node:1.0
    //
    public void
    destroy_node(String a_node,
                 edu.iris.Fissures.AuditInfo[] audit_info)
        throws NotFound
    {
        _ob_delegate_.destroy_node(a_node,
                                   audit_info);
    }
}
