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
// IDL:iris.edu/Fissures/Unit:1.0
//
final public class UnitHelper
{
    public static void
    insert(org.omg.CORBA.Any any, Unit val)
    {
        any.insert_Value(val, type());
    }

    public static Unit
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
        {
            java.io.Serializable _ob_v = any.extract_Value();
            if(_ob_v instanceof Unit)
                return (Unit)_ob_v;
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            org.omg.CORBA.ValueMember[] members = new org.omg.CORBA.ValueMember[6];

            members[0] = new org.omg.CORBA.ValueMember();
            members[0].name = "the_unit_base";
            members[0].type = UnitBaseHelper.type();
            members[0].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            members[1] = new org.omg.CORBA.ValueMember();
            members[1].name = "elements";
            org.omg.CORBA.TypeCode content0;
            content0 = orb.create_recursive_tc(id());
            members[1].type = orb.create_sequence_tc(0, content0);
            members[1].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            members[2] = new org.omg.CORBA.ValueMember();
            members[2].name = "power";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
            members[2].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            members[3] = new org.omg.CORBA.ValueMember();
            members[3].name = "name";
            members[3].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
            members[3].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            members[4] = new org.omg.CORBA.ValueMember();
            members[4].name = "multi_factor";
            members[4].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_double);
            members[4].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            members[5] = new org.omg.CORBA.ValueMember();
            members[5].name = "exponent";
            members[5].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
            members[5].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            typeCode_ = orb.create_value_tc(id(), "Unit", org.omg.CORBA.VM_NONE.value, null, members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/Unit:1.0";
    }

    public static Unit
    read(org.omg.CORBA.portable.InputStream in)
    {
        if(!(in instanceof org.omg.CORBA_2_3.portable.InputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        return (Unit)((org.omg.CORBA_2_3.portable.InputStream)in).read_value(id());
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, Unit val)
    {
        if(!(out instanceof org.omg.CORBA_2_3.portable.OutputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        ((org.omg.CORBA_2_3.portable.OutputStream)out).write_value(val, id());
    }
}