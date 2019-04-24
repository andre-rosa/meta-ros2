# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demo nodes to demonstrate the usage of the grid map library."
AUTHOR = "Péter Fankhauser <pfankhauser@anybotics.com>"
HOMEPAGE = "http://github.com/ethz-asl/grid_map"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-filters \
    grid-map-loader \
    grid-map-msgs \
    grid-map-octomap \
    grid-map-ros \
    grid-map-rviz-plugin \
    grid-map-visualization \
    octomap-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-filters \
    grid-map-loader \
    grid-map-msgs \
    grid-map-octomap \
    grid-map-ros \
    grid-map-rviz-plugin \
    grid-map-visualization \
    octomap-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-filters \
    grid-map-loader \
    grid-map-msgs \
    grid-map-octomap \
    grid-map-ros \
    grid-map-rviz-plugin \
    grid-map-visualization \
    octomap-msgs \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_demos/1.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d352989aecefa002a1c48c2ba3f43742"
SRC_URI[sha256sum] = "b3d00b7333759db2f16c379f918ba9bb9d172292fd31f64c853d8b31b4e21bb7"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_demos-1.6.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/grid-map/grid-map_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/grid-map/grid-map_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/grid-map/grid-map-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/grid-map/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/grid-map/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
