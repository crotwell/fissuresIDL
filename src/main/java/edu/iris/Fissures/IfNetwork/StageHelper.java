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
// IDL:iris.edu/Fissures/IfNetwork/Stage:1.0
//
final public class StageHelper
{
    public static void
    insert(org.omg.CORBA.Any any, Stage val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static Stage
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
            return read(any.create_input_stream());
        else
            throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[7];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "type";
            members[0].type = TransferTypeHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "input_units";
            members[1].type = edu.iris.Fissures.UnitHelper.type();

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "output_units";
            members[2].type = edu.iris.Fissures.UnitHelper.type();

            members[3] = new org.omg.CORBA.StructMember();
            members[3].name = "the_normalization";
            members[3].type = NormalizationOptHelper.type();

            members[4] = new org.omg.CORBA.StructMember();
            members[4].name = "the_gain";
            members[4].type = GainHelper.type();

            members[5] = new org.omg.CORBA.StructMember();
            members[5].name = "the_decimation";
            members[5].type = DecimationOptHelper.type();

            members[6] = new org.omg.CORBA.StructMember();
            members[6].name = "filters";
            members[6].type = FilterSeqHelper.type();

            typeCode_ = orb.create_struct_tc(id(), "Stage", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfNetwork/Stage:1.0";
    }

    public static Stage
    read(org.omg.CORBA.portable.InputStream in)
    {
        Stage _ob_v = new Stage();
        _ob_v.type = TransferTypeHelper.read(in);
        _ob_v.input_units = edu.iris.Fissures.UnitHelper.read(in);
        _ob_v.output_units = edu.iris.Fissures.UnitHelper.read(in);
        _ob_v.the_normalization = NormalizationOptHelper.read(in);
        _ob_v.the_gain = GainHelper.read(in);
        _ob_v.the_decimation = DecimationOptHelper.read(in);
        _ob_v.filters = FilterSeqHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, Stage val)
    {
        TransferTypeHelper.write(out, val.type);
        edu.iris.Fissures.UnitHelper.write(out, val.input_units);
        edu.iris.Fissures.UnitHelper.write(out, val.output_units);
        NormalizationOptHelper.write(out, val.the_normalization);
        GainHelper.write(out, val.the_gain);
        DecimationOptHelper.write(out, val.the_decimation);
        FilterSeqHelper.write(out, val.filters);
    }
}