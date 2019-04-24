# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OpenManipulator controller package"
AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/open_manipulator_controller"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake-modules \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    open-manipulator-libs \
    open-manipulator-msgs \
    robotis-manipulator \
    roscpp \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cmake-modules \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    open-manipulator-libs \
    open-manipulator-msgs \
    robotis-manipulator \
    roscpp \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cmake-modules \
    geometry-msgs \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    open-manipulator-libs \
    open-manipulator-msgs \
    robotis-manipulator \
    roscpp \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_controller/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5ce9cfee11723ed3cb12fd525f78035d"
SRC_URI[sha256sum] = "b19bbeab199f991d98fc26473d59f22d1501ae8954c2e413edae34a276ba334c"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_controller-2.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/open-manipulator/open-manipulator_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/open-manipulator/open-manipulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/open-manipulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
