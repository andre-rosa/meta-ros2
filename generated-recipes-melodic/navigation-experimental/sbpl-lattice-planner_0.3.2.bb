# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The sbpl_lattice_planner is a global planner plugin for move_base and wraps     the SBPL search-based planning library."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
HOMEPAGE = "http://wiki.ros.org/sbpl_lattice_planner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    message-generation \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    sbpl \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    sbpl \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    message-runtime \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    sbpl \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/sbpl_lattice_planner/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "509ed907bf7209247dff1eaf82e56bf9"
SRC_URI[sha256sum] = "e78f8dc5ccf4ffb74f314de47656e49eca331b5cb262d6edfb4ea2729eab56c8"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-sbpl_lattice_planner-0.3.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/navigation-experimental/navigation-experimental_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/navigation-experimental/navigation-experimental_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-experimental/navigation-experimental-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-experimental/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-experimental/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
