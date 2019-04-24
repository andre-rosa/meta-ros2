# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Launch files to start the openni2_camera drivers using rgbd_launch."
AUTHOR = "Isaac I. Y. Saito <isaac.saito@plusonerobotics.com>"
ROS_AUTHOR = "Julius Kammerl <kammerl@willowgarage.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni2_camera"
ROS_BPN = "openni2_launch"

ROS_BUILD_DEPENDS = " \
    python-catkin-pkg \
    roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    depth-image-proc \
    image-proc \
    nodelet \
    openni2-camera \
    rgbd-launch \
    rospy \
    roswtf \
    tf \
    usbutils \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    depth-image-proc \
    image-proc \
    nodelet \
    openni2-camera \
    rgbd-launch \
    rospy \
    roswtf \
    tf \
    usbutils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/openni2_camera-release/archive/release/melodic/openni2_launch/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "79efdc2b10a6858cb9e157a35cf7c720"
SRC_URI[sha256sum] = "51d7ca0ca441737e619194d4ffbfcf7dd76a586724845ca4641394967d2286a1"
S = "${WORKDIR}/openni2_camera-release-release-melodic-openni2_launch-0.4.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('openni2-camera', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('openni2-camera', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/openni2-camera_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/openni2-camera-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
