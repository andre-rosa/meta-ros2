# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "RTAB-Map's standalone library. RTAB-Map is a RGB-D SLAM approach with real-time constraints."
AUTHOR = "Mathieu Labbe <matlabbe@gmail.com>"
ROS_AUTHOR = "Mathieu Labbe"
HOMEPAGE = "http://introlab.github.io/rtabmap"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtabmap"
ROS_BPN = "rtabmap"

ROS_BUILD_DEPENDS = " \
    acpica \
    cv-bridge \
    libfreenect \
    libg2o \
    libopenni-dev \
    libvtk-qt \
    octomap \
    pcl \
    qt-gui-cpp \
    sqlite3 \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    libfreenect \
    libg2o \
    libopenni-dev \
    libvtk-qt \
    octomap \
    pcl \
    qt-gui-cpp \
    sqlite3 \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    libfreenect \
    libg2o \
    libopenni-dev \
    libvtk-qt \
    octomap \
    pcl \
    qt-gui-cpp \
    sqlite3 \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/introlab/rtabmap-release/archive/release/melodic/rtabmap/0.17.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "485491e9757220a4b57a4d4a5831daf0"
SRC_URI[sha256sum] = "ef29a24868205118c1363dc6d9b8700ece63647ee2c10b2cbefd1b2741f76a6d"
S = "${WORKDIR}/rtabmap-release-release-melodic-rtabmap-0.17.6-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rtabmap', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rtabmap', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap/rtabmap_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap/rtabmap-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rtabmap/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}