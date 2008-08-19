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
// IDL:iris.edu/Fissures/AuditSystemAccess:1.0
//
public class _AuditSystemAccessStub extends org.omg.CORBA.portable.ObjectImpl
                                    implements AuditSystemAccess
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/AuditSystemAccess:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = AuditSystemAccess.class;

    //
    // IDL:iris.edu/Fissures/AuditSystemAccess/get_audit_trail:1.0
    //
    public AuditElement[]
    get_audit_trail()
        throws NotImplemented
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_audit_trail", true);
                    in = _invoke(out);
                    AuditElement[] _ob_r = AuditTrailHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(NotImplementedHelper.id()))
                        throw NotImplementedHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_audit_trail", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                AuditSystemAccess _ob_self = (AuditSystemAccess)_ob_so.servant;
                try
                {
                    return _ob_self.get_audit_trail();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
