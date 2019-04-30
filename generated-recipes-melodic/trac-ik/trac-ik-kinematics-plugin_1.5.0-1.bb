# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A MoveIt! Kinematics plugin using TRAC-IK"
AUTHOR = "Patrick Beeson <pbeeson@traclabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
    trac-ik-lib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
    trac-ik-lib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
    trac-ik-lib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_kinematics_plugin/1.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "41a11fb36ab66cd69eb1f47ff38738ce"
SRC_URI[sha256sum] = "9ac973d39470f1f0648e6e01cdd11b7207d61f3482bf7a4c302e43b7ae53896f"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_kinematics_plugin-1.5.0-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/trac-ik/trac-ik_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/trac-ik/trac-ik_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/trac-ik-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
