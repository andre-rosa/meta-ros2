# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package contains the source code for testing and comparing trac_ik"
AUTHOR = "Patrick Beeson <pbeeson@traclabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "trac_ik_examples"

ROS_BUILD_DEPENDS = " \
    boost \
    orocos-kdl \
    trac-ik-lib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    orocos-kdl \
    trac-ik-lib \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    orocos-kdl \
    trac-ik-lib \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_examples/1.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3002c5220357ec63f11cfcd1385261f4"
SRC_URI[sha256sum] = "49d6aacadb0b51e61c60dfadbcb86be6408dd9887a126fb6db9b429f96d380c3"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_examples-1.5.0-1"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('trac-ik', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/trac-ik_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/trac-ik-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
