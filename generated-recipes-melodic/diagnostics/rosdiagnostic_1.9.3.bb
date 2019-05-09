# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Command to print aggregated diagnostic contents to the command line"
AUTHOR = "Guillaume Autran <gautran@clearpath.ai>"
ROS_AUTHOR = "Guillaume Autran <gautran@clearpath.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "diagnostics"
ROS_BPN = "rosdiagnostic"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/rosdiagnostic/1.9.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b440f8c8a4c8d04172d67238b9ffe71b"
SRC_URI[sha256sum] = "1244881acaaeb2251f829e4705bbf88e5d1f99d161d24a4ab99bae9a138b85c5"
S = "${WORKDIR}/diagnostics-release-release-melodic-rosdiagnostic-1.9.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('diagnostics', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('diagnostics', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/diagnostics/diagnostics_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/diagnostics/diagnostics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/diagnostics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/diagnostics/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
