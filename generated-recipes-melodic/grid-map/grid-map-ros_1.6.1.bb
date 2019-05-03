# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROS interface for the grid map library to manage two-dimensional grid maps with multiple data layers."
AUTHOR = "Péter Fankhauser <pfankhauser@anybotics.com>"
HOMEPAGE = "http://github.com/ethz-asl/grid_map"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "grid_map_ros"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-msgs \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-msgs \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-msgs \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
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

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_ros/1.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ba893bb34018aec23693370ffc844f24"
SRC_URI[sha256sum] = "bf681f58909865945e276e25c9762d8b641931b03531e92d26c1dd9dc22dcd25"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_ros-1.6.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('grid-map', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/grid-map/grid-map_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/grid-map/grid-map-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/grid-map/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/grid-map/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
