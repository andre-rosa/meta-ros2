# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nodelet package is designed to provide a way to run multiple     algorithms in the same process with zero copy transport between     algorithms.      This package provides both the nodelet base class needed for     implementing a nodelet, as well as the NodeletLoader class used     for instantiating nodelets."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/nodelet"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    bondcpp \
    boost \
    cmake-modules \
    message-generation \
    pluginlib \
    rosconsole \
    roscpp \
    std-msgs \
    uuid \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    bondcpp \
    boost \
    pluginlib \
    rosconsole \
    roscpp \
    std-msgs \
    uuid \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bondcpp \
    boost \
    message-runtime \
    pluginlib \
    rosconsole \
    roscpp \
    rospy \
    std-msgs \
    uuid \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/melodic/nodelet/1.9.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "405be4cc42091670f96ebd2d7fb567bc"
SRC_URI[sha256sum] = "3a9e9701df570659d70f871eb7e1970dacd3b89c02513c456f8f0ea1a446d15a"
S = "${WORKDIR}/nodelet_core-release-release-melodic-nodelet-1.9.16-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/nodelet-core/nodelet-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/nodelet-core/nodelet-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/nodelet-core/nodelet-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/nodelet-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/nodelet-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
