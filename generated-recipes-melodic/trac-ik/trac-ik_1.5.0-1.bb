# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The ROS packages in this repository were created to provide an improved     alternative Inverse Kinematics solver to the popular inverse Jacobian     methods in KDL.  TRAC-IK handles joint-limited chains better than KDL     without increasing solve time."
AUTHOR = "Patrick Beeson <pbeeson@traclabs.com>"
ROS_AUTHOR = "Patrick Beeson"
HOMEPAGE = "http://wiki.ros.org/trac_ik"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "trac_ik"
ROS_BPN = "trac_ik"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    trac-ik-examples \
    trac-ik-kinematics-plugin \
    trac-ik-lib \
    trac-ik-python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    trac-ik-examples \
    trac-ik-kinematics-plugin \
    trac-ik-lib \
    trac-ik-python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik/1.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2eb3c1d74d617f7c888cc28182966c03"
SRC_URI[sha256sum] = "c985213ab2ea13f1d77ffd934d03abb7f1cd6364f98247d8ce9d483161cd6b32"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik-1.5.0-1"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('trac-ik', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('trac-ik', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/trac-ik_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/trac-ik-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
