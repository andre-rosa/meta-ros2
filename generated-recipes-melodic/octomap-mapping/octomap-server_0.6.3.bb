# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "octomap_server loads a 3D map (as Octree-based OctoMap) and distributes it to other nodes in a compact binary format. It also allows to incrementally build 3D OctoMaps, and provides map saving in the node octomap_saver."
AUTHOR = "Wolfgang Merkt <w.merkt+oss@gmail.com>"
ROS_AUTHOR = "Armin Hornung"
HOMEPAGE = "http://www.ros.org/wiki/octomap_server"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "octomap_mapping"
ROS_BPN = "octomap_server"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    nav-msgs \
    nodelet \
    octomap \
    octomap-msgs \
    octomap-ros \
    pcl \
    pcl-conversions \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    nav-msgs \
    nodelet \
    octomap \
    octomap-msgs \
    octomap-ros \
    pcl \
    pcl-conversions \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    nav-msgs \
    nodelet \
    octomap \
    octomap-msgs \
    octomap-ros \
    pcl \
    pcl-conversions \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/octomap_mapping-release/archive/release/melodic/octomap_server/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "06a2b0e5cd86f30d22e8c291bfe5e07e"
SRC_URI[sha256sum] = "3cd3bc10e3c4567f7589abd4d3029b5b346d8db5944fb427a9097cc35c3c9296"
S = "${WORKDIR}/octomap_mapping-release-release-melodic-octomap_server-0.6.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('octomap-mapping', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('octomap-mapping', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-mapping/octomap-mapping_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-mapping/octomap-mapping-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-mapping/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/octomap-mapping/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
