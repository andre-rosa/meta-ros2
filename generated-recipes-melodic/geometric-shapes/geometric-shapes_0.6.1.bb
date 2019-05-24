# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
AUTHOR = "Dave Coleman <dave@dav.ee>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://ros.org/wiki/geometric_shapes"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometric_shapes"
ROS_BPN = "geometric_shapes"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    eigen-stl-containers \
    libeigen \
    octomap \
    pkgconfig \
    qhull \
    random-numbers \
    resource-retriever \
    shape-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    eigen-stl-containers \
    libeigen \
    octomap \
    qhull \
    random-numbers \
    resource-retriever \
    shape-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    eigen-stl-containers \
    libeigen \
    octomap \
    qhull \
    random-numbers \
    resource-retriever \
    shape-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/geometric_shapes-release/archive/release/melodic/geometric_shapes/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6e468e145b14354ce0d002af37be80f2"
SRC_URI[sha256sum] = "d30facbce2033851ba0b121a75c8d41c47a91831e51efb11dafe3bc877a50809"
S = "${WORKDIR}/geometric_shapes-release-release-melodic-geometric_shapes-0.6.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('geometric-shapes', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('geometric-shapes', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometric-shapes/geometric-shapes_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometric-shapes/geometric-shapes-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometric-shapes/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometric-shapes/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
