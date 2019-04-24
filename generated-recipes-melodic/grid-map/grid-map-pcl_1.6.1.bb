# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Conversions between grid maps and Point Cloud Library (PCL) types."
AUTHOR = "Péter Fankhauser <pfankhauser@anybotics.com>"
ROS_AUTHOR = "Dominic Jud <djud@ethz.ch>"
HOMEPAGE = "http://github.com/ethz-asl/grid_map"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "grid_map"
ROS_BPN = "grid_map_pcl"

ROS_BUILD_DEPENDS = " \
    grid-map-core \
    pcl-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    grid-map-core \
    pcl-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    grid-map-core \
    pcl-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_pcl/1.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1d8866e4e205e09a2ab24af518782785"
SRC_URI[sha256sum] = "cd37b6d275b0d1afa0755a76162c63914f46c02465318338481db82341e0fba9"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_pcl-1.6.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('grid-map', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('grid-map', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grid-map/grid-map_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grid-map/grid-map-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grid-map/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/grid-map/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
