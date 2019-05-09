# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROS package for Multiple objects detection, tracking and classification from LIDAR scans/point-clouds"
AUTHOR = "Praveen Palanisamy <praveen.palanisamy@outlook.com>"
ROS_AUTHOR = "Praveen Palanisamy <praveen.palanisamy@outlook.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "multi_object_tracking_lidar"
ROS_BPN = "multi_object_tracking_lidar"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/praveen-palanisamy/multi_object_tracking_lidar-release/archive/release/melodic/multi_object_tracking_lidar/1.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "781515c355686ffd7fae7e1b6247d4f1"
SRC_URI[sha256sum] = "2c8c139caef500a457297233231fcdb913d3106954789481277d4c028df6219f"
S = "${WORKDIR}/multi_object_tracking_lidar-release-release-melodic-multi_object_tracking_lidar-1.0.1-1"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('multi-object-tracking-lidar', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('multi-object-tracking-lidar', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multi-object-tracking-lidar/multi-object-tracking-lidar_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multi-object-tracking-lidar/multi-object-tracking-lidar-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multi-object-tracking-lidar/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multi-object-tracking-lidar/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
