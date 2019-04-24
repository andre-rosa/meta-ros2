# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Configurable tool to visualize grid maps in RViz."
AUTHOR = "Péter Fankhauser <pfankhauser@anybotics.com>"
HOMEPAGE = "http://github.com/ethz-asl/grid_map"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    grid-map-core \
    grid-map-msgs \
    grid-map-ros \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    grid-map-core \
    grid-map-msgs \
    grid-map-ros \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    grid-map-core \
    grid-map-msgs \
    grid-map-ros \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_visualization/1.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0bb68607c428d6d8d309506b8fad8f2f"
SRC_URI[sha256sum] = "c35030b57adc01d75f9d3e5e061c933839f850d7a4d6dbc4d9a0f3fcdd1e0803"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_visualization-1.6.1-0"

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
