# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Model files of OpenNI device."
AUTHOR = "Isaac I.Y. Saito <130s@2000.jukuin.keio.ac.jp>"
ROS_AUTHOR = "Isaac I.Y. Saito <isaac.saito@plusonerobotics.com>"
HOMEPAGE = "http://www.ros.org/wiki/openni_description"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni_camera"
ROS_BPN = "openni_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    urdf \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    liburdfdom-tools \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/melodic/openni_description/1.11.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "504595e0ff6bcc4f0a11dc9e308f7d9e"
SRC_URI[sha256sum] = "709e253ea9d2ba4d1c81fe758da31e8359a8e00f4e0105405f37a6e68e011dc8"
S = "${WORKDIR}/openni_camera-release-release-melodic-openni_description-1.11.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('openni-camera', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('openni-camera', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni-camera/openni-camera_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni-camera/openni-camera-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni-camera/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni-camera/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}