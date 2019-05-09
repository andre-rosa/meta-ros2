# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A Python-based implementation of the rosserial protocol."
AUTHOR = "Paul Bouchier <paul.bouchier@gmail.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/rosserial_python"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosserial"
ROS_BPN = "rosserial_python"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    python-serial \
    rospy \
    rosserial-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    python-serial \
    rospy \
    rosserial-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_python/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d2c6afb135553b4bad41651c49b995ca"
SRC_URI[sha256sum] = "dc7ee1151a0b5b2dea4b0987e98c0296b67bfc4addb31ae70e14f33e18dd02c2"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_python-0.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('rosserial', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rosserial', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosserial/rosserial_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosserial/rosserial-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosserial/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosserial/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
