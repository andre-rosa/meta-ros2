# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides ros nodes for multi-sensor arrays from Terabee"
AUTHOR = "Pierre-Louis Kabaradjian <pierre-louis.kabaradjian@terabee.com>"
ROS_AUTHOR = "Pierre-Louis Kabaradjian <pierre-louis.kabaradjian@terabee.com>"
HOMEPAGE = "http://wiki.ros.org/teraranger_array"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "teraranger_array"
ROS_BPN = "teraranger_array"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    roscpp \
    rospy \
    sensor-msgs \
    serial \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    roscpp \
    rospy \
    sensor-msgs \
    serial \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    roscpp \
    rospy \
    sensor-msgs \
    serial \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/Terabee/teraranger_array-release/archive/release/melodic/teraranger_array/2.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dc452576f764d51727df732ab378db47"
SRC_URI[sha256sum] = "7d5ebf525e7be16d78cbeb170579970889386e503e84f571b4187450e3784233"
S = "${WORKDIR}/teraranger_array-release-release-melodic-teraranger_array-2.0.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('teraranger-array', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('teraranger-array', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teraranger-array/teraranger-array_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teraranger-array/teraranger-array-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teraranger-array/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teraranger-array/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
