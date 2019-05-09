# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "rqt_multiplot provides a GUI plugin for visualizing numeric values     in multiple 2D plots using the Qwt plotting backend."
AUTHOR = "Ralf Kaestner <ralf.kaestner@gmail.com>"
ROS_AUTHOR = "Ralf Kaestner"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=146ba316845cfe6058c8baebd902a726"

ROS_CN = "rqt_multiplot_plugin"
ROS_BPN = "rqt_multiplot"

ROS_BUILD_DEPENDS = " \
    libqwt-qt5-dev \
    qtbase \
    rosbag \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
    variant-topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libqwt-qt5-dev \
    qtbase \
    rosbag \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
    variant-topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libqwt-qt5-dev \
    qtbase \
    rosbag \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
    variant-topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/anybotics/rqt_multiplot_plugin-release/archive/release/melodic/rqt_multiplot/0.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "198d42954b04c532f02bb23079fff91c"
SRC_URI[sha256sum] = "92e975517c6726dcd8a9c73c658d524126d48716bd4db032cec61f641ce27ae8"
S = "${WORKDIR}/rqt_multiplot_plugin-release-release-melodic-rqt_multiplot-0.0.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('rqt-multiplot-plugin', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rqt-multiplot-plugin', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-multiplot-plugin/rqt-multiplot-plugin_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-multiplot-plugin/rqt-multiplot-plugin-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-multiplot-plugin/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-multiplot-plugin/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
